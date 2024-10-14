package com.wh.wh40k_datasheet_viewer.datasheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatasheetController {
    private final DatasheetService datasheetService;

    @Autowired
    public DatasheetController(DatasheetService datasheetService) {
        this.datasheetService = datasheetService;
    }

    @GetMapping("/index")
    public List<Datasheet> getDatasheets(@RequestParam(required = false) String name) {
        if (name != null) {
            return datasheetService.getDatasheetsByName(name);
        }

        return datasheetService.getDatasheets();
    }
}
