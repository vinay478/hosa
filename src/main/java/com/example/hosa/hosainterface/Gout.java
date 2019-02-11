package com.example.hosa.hosainterface;
import com.example.hosa.entity.Data2;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

@EnableAutoConfiguration
public interface Gout extends JpaRepository<Data2,Integer>
{

}

