package com.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.app.controller.BillController;


@RunWith(SpringRunner.class)
@WebMvcTest(BillController.class)
public class JunitTest {
 
	@Autowired
    private MockMvc mvc;
 
   
	@Test
	public void employeeSuccess() throws Exception
	{
		String uri = "/getBill/1";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertEquals("40.5", resultValue);
	}
	
	@Test
	public void affiliateSuccess() throws Exception
	{
		String uri = "/getBill/2";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertEquals("36.0", resultValue);
	}
	
	@Test
	public void customerSuccess() throws Exception
	{
		String uri = "/getBill/3";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertEquals("430.0", resultValue);
	}
	
	@Test
	public void employeeFailure() throws Exception
	{
		String uri = "/getBill/4";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertNotEquals("18.5", resultValue);
	}
	
	@Test
	public void affiliateFailure() throws Exception
	{
		String uri = "/getBill/5";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertNotEquals("17.6", resultValue);
	}
	
	@Test
	public void customerFailure() throws Exception
	{
		String uri = "/getBill/6";
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
		      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		   
		   int status = mvcResult.getResponse().getStatus();
		   String resultValue = mvcResult.getResponse().getContentAsString();
		   
		   assertEquals(200, status);
		   assertNotEquals("102.5", resultValue);
	}
	
}
