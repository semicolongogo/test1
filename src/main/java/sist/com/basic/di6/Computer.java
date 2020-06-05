package sist.com.basic.di6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="com")
@Scope("singleton")
@Qualifier(value="com1")
public class Computer {
	@Value("삼성")
	private String maker;
	@Value("5000")
	private int price;
	@Value("co1245")
	private String modelName;
	@Value("16RAM")
	private String ram;
	@Value("ICORE7")
	private String cpu;	
	public Computer() {
		System.out.println("ComputerContructor");
	}
	public Computer(String maker, int price, String modelName, String ram, String cpu) {
		super();
		this.maker = maker;
		this.price = price;
		this.modelName = modelName;
		this.ram = ram;
		this.cpu = cpu;
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	@Override
	public String toString() {
		return "Computer [maker=" + maker + ", price=" + price + ", modelName=" + modelName + ", ram=" + ram + ", cpu="
				+ cpu + "]";
	}
	
	
	
	

}
