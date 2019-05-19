package com.imooc.weatherssss.controller;

import com.imooc.weatherssss.service.CityDataService;
import com.imooc.weatherssss.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author 周启江
 * @ClassName: CityListController
 * @date 2019/5/19 11:17
 */
@RestController
public class CityListController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping("/cityList")
    public List<City> getCityData(){
        return cityDataService.getCityList().getCityList();
    }

}
