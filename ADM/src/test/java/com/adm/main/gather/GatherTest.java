package com.adm.main.gather;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.GatherDTO;
import com.adm.main.repository.GatherRepository;

@SpringBootTest
public class GatherTest {
	@Autowired
	GatherRepository ge;

	
	  @Test 
	  void contextLoads() { 
		  GatherDTO gather = new GatherDTO().builder()
				  .gathername("test")
				  .gatherid(2)
				  .userid("wh467925")
				  .number_of_member(45)
				  .category("�")
				  .gather_info("��ϱ�Ⱦ��")
				  .img("a.jpg")
				  .build();
	  
	  ge.save(gather);
	  }
	

	@Test
	void finaAll() {
		//��ü ����Ʈ ��ȸ
		List<GatherDTO> gather = ge.findAll();
	}

	
	
	  @Test	  
	  void delete() { 
		//����
		 GatherDTO gather = ge.findById((int)1).get();
		 ge.delete(gather); 
	  }
	 
	

}
