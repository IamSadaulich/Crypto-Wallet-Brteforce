package main.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(insertable = false, updatable = false, nullable = false)
    @Enumerated(EnumType.STRING)
    private GlobalSettingCode code;

    @Column(insertable = false, updatable = false, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GlobalSettingValue value;

    public int getId() {
        return id;
    }

    public GlobalSettingCode getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public GlobalSettingValue getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(GlobalSettingValue value) {
        this.value = value;
    }
}

