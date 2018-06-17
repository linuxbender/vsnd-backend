package ch.vsnd.vsndbackend.api.v1.SytemInfo;

import lombok.Builder;

@Builder
public class SystemInfoDto {
    public final String backendVersion;
    public final String frontendVersion;
}
