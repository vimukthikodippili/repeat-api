package lk.ijse.service.impl;

import lk.ijse.dto.AdminDTO;
import lk.ijse.entity.Admin;
import lk.ijse.repo.AdminRepo;
import lk.ijse.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class AdminServiceImpl  implements AdminService {
    @Autowired
private ModelMapper modelMapper;
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public void addAdmin(AdminDTO dto) {

    }

    @Override
    public void deleteAdmin(String id) {

    }

    @Override

    public AdminDTO searchAdmin(String id) {
        Optional<Admin> customer = adminRepo.findById(id);
        if (customer.isPresent()) {
            return modelMapper.map(customer.get(), AdminDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        return null;
    }

    @Override
    public void updateAdmin(AdminDTO dto) {

    }
}
