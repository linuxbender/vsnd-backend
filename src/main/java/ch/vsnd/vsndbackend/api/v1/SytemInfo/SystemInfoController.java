package ch.vsnd.vsndbackend.api.v1.SytemInfo;

import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/systemInfo")
public class SystemInfoController {

    private SystemInfoService systemInfoService;

    public SystemInfoController(@NonNull SystemInfoService systemInfoService) {
        this.systemInfoService = systemInfoService;
    }

    @GetMapping
    public ResponseEntity<?> getSystemInfo() {
        return ResponseEntity.ok(this.systemInfoService.getSystemInfo());
    }
}
