package ch.vsnd.vsndbackend.api.v1.SytemInfo;

import org.springframework.stereotype.Service;

@Service
public class SystemInfoServiceImpl implements SystemInfoService {

    @Override
    public SystemInfoDto getSystemInfo() {
        return SystemInfoDto.builder().backendVersion("0.0.1").frontendVersion("0.0.1").build();
    }
}
