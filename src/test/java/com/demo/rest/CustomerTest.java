package com.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.demo.rest.pojo.Customer;
import com.demo.rest.service.CustomerServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=RestApplication.class)
public class CustomerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private MockMvc mockMvc;
/*
	@InjectMocks
	private CustomerController demo;*/

	/*@Autowired
	private WebApplicationContext wac;*/
	
	@Before
	public void setUp() throws Exception {
		//this.mockMvc = MockMvcBuilders.standaloneSetup(demo).build();
	}

	@Mock
	CustomerServiceImpl customerService;

	@Test
	public void testViewCustomer() throws Exception {
		//mockMvc.perform(get("/customers")/*.accept((MediaType.APPLICATION_JSON))*/).andExpect(status().isOk());
			/*	.andExpect(jsonPath("$.customerId").value(101))
				.andExpect(jsonPath("$.customerName").value("Drishti Rao"));*/
		List<Customer> customers = testRestTemplate.getForObject("/customers", ArrayList.class);
		 System.out.println(customers);
	}

	@Test
	public void testViewCustomerBetween() throws Exception {
		//mockMvc.perform(get("/customers/1/2")).andExpect(status().isOk());
		/* .andExpect(content().contentType(MediaType.APPLICATION_JSON)) */
		/*
		 * .andExpect(jsonPath("$.customerId").value(101))
		 * .andExpect(jsonPath("$.customerName").value("Drishti Rao"));
		 */

	}

}
