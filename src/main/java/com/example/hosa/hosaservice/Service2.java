package com.example.hosa.hosaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.hosa.entity.Data2;
import com.example.hosa.hosainterface.Gout;


import javax.websocket.server.PathParam;
import java.util.*;

@RestController
public class Service2
{
    @Autowired
    private Gout gout;
    @RequestMapping("/all")
    public List<Data2>getAll()
    {
        List<Data2> data2List;
        data2List = gout.findAll();
        return data2List;
    }
    @PostMapping(value="/load")
    public String posting(@RequestBody Data2 data2)
    {
        gout.save(data2);
        return "sucessfully added";
    }
    @DeleteMapping(value = "/delete/{id}")
     public String remove(@PathVariable String id)
    {

        Integer inputId=Integer.parseInt(id);
        gout.deleteById(inputId);
        return "successfully removed";
    }

}

