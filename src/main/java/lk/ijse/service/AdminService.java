package lk.ijse.service;

import lk.ijse.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    void addAdmin(AdminDTO dto);

    void deleteAdmin(String id);

    AdminDTO searchAdmin(String id);

    ArrayList<AdminDTO> getAllAdmin();

    void updateAdmin(AdminDTO dto);
}
