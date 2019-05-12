package com.example.demo;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.jdbc.core.JdbcTemplate;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

@RestController
@RequestMapping(value="zboruri")
public class Controller {
    @Autowired
    private ZborService zborService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/")
    public ApiResponse<List<Zbor>> getZboruri() {
        return new ApiResponse<>(HttpStatus.OK.value(), "", zborService.getAll());
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/list")
    public List<Zbor> getZboruriList() {
        return zborService.getAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/{zborId}")
    public ApiResponse<Zbor> getZbor( @PathVariable("zborId") Integer zborId) {
        return new ApiResponse<>(HttpStatus.OK.value(),"", zborService.getOrg(zborId).get());
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value="/{zborId}")
    public ApiResponse<Void> updateOrganization( @PathVariable("zborId") Integer orgId, @RequestBody Zbor org) {
        zborService.updateOrg( org );
        return new ApiResponse<>(HttpStatus.OK.value(),"",null);

    }

     @GetMapping(value="cumpara/{zborId}")
    public ApiResponse<Void> cumpara( @PathVariable("zborId") Integer orgId) {
        Zbor z = zborService.getById(orgId);
        z.setLocDisp(z.getLocDisp() - 1);
        zborService.updateOrg( z );
        return new ApiResponse<>(HttpStatus.OK.value(),"",null);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value="/")
    public ApiResponse<Void> saveOrganization(@RequestBody Zbor org) {
        zborService.saveOrg( org );
        return new ApiResponse<>(HttpStatus.OK.value(),"",null);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value="/{zborId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ApiResponse<Void> deleteOrganization( @PathVariable("zborId") String orgId) {
        zborService.deleteOrg( orgId );
        return new ApiResponse<>(HttpStatus.OK.value(),"",null);
    }
}
