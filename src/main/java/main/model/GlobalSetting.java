package main.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private GlobalSettingCode code;

    @Column(insertable = false, updatable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private GlobalSettingValue value;
}

enum GlobalSettingCode {
    MULTIUSER_MODE,
    POST_PREMODERATION,
    STATISTICS_IS_PUBLIC
}

enum GlobalSettingValue {
    YES, NO
}