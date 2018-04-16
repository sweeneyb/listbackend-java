package com.sweeneyb.listBackend;

import com.sweeneyb.listBackend.dto.ListItem;
import com.sweeneyb.listBackend.dto.ListItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListBackendApplicationTests {

	@Autowired
	ListItemRepository repo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAddAndDelete() {
		ListItem item = new ListItem("test item");
		LocalDateTime id = item.getId();
		repo.save(item);
		assertThat(repo.existsById(id)).isTrue();

		repo.deleteById(id);
		assertThat(repo.existsById(id)).isFalse();
	}

}
