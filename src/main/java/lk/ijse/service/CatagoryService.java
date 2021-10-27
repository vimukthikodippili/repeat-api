package lk.ijse.service;

import lk.ijse.dto.CatagoryDTO;

import java.util.ArrayList;

public interface CatagoryService {
    void addCatagory(CatagoryDTO dto);

    void deleteCuatagory(String id);

    CatagoryDTO searchCatagory(String id);

    ArrayList<CatagoryDTO> getAllCatagory();

    void updateCatagory(CatagoryDTO dto);
}
