package main.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSetting extends BaseEntity {
    @Column(insertable = false, updatable = false, nullable = false)
    @Enumerated(EnumType.STRING)
    private GlobalSettingCode code;

    @Column(insertable = false, updatable = false, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
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