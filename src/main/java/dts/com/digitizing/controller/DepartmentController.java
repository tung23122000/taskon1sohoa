package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.repository.DepartmentRespository;
import dts.com.digitizing.service.DepartmentSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DepartmentController {
    private final DepartmentSevice departmentSevice;
    private final DepartmentRespository departmentRespository;
    public DepartmentController(DepartmentSevice departmentSevice,
                                DepartmentRespository departmentRespository) {this.departmentSevice = departmentSevice;
        this.departmentRespository = departmentRespository;
    }

    @GetMapping("/all")
    public List<Department> allList(){
        System.out.println(departmentRespository.findAll());
        return departmentRespository.findAll();
    }
//    @GetMapping("/all")
//    public String get(){
//        return "aa";
//    }
}
