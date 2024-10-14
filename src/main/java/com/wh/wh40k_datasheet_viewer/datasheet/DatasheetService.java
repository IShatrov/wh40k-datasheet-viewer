package com.wh.wh40k_datasheet_viewer.datasheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DatasheetService {
    private final DatasheetRepository datasheetRepository;

    @Autowired
    public DatasheetService(DatasheetRepository datasheetRepository) {
        this.datasheetRepository = datasheetRepository;
    }

    public List<Datasheet> getDatasheets() {
        return datasheetRepository.findAll();
    }

    public List<Datasheet> getDatasheetsByName(String nameToSearch) {
        return datasheetRepository.findAll().stream()
                .filter(datasheet -> datasheet.getName().toLowerCase().contains(nameToSearch.trim().toLowerCase()))
                .collect(Collectors.toList());
    }
}
