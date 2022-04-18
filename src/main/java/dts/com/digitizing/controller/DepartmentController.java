package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.service.DepartmentSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DepartmentController {
    private final DepartmentSevice departmentSevice;

    public DepartmentController(DepartmentSevice departmentSevice
                               ) {this.departmentSevice = departmentSevice;

    }

    @GetMapping("/all")
    public List<Department> allList(){
        System.out.println(departmentSevice.getall());
        return departmentSevice.getall();
    }
//    @GetMapping("/all")
//    public String get(){
//        return "aa";
//    }
}
