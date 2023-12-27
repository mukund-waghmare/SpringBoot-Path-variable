package com.ty.pathvariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pathController {
	
	@GetMapping("/map/{cid}")
	public String getinfo(@PathVariable	int cid)
	{
		return ""+cid;
	}
	
	@GetMapping("/getIdAndName/{id}/{name}")
	public String getIdAndName(@PathVariable int id,@PathVariable String name)
	{
		return "Id : "+id+"\n"+name;
	}

	@GetMapping("/changeVar/{id}")
	public String changeName(@PathVariable(name = "id")int iid)
	{
		return "" +iid;
	}
}
