package co.edu.uco.grades.dto;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.crosscutting.util.text.UtilText;

public class IdTypeDTO {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = UtilText.getDefault(name);
	}
	
	public List<String> validateName(){
		List<String> validationMessages = new ArrayList<>();
		
		if(UtilText.isEmpty(getName())) {
			validationMessages.add("Name of id type is required");
		} else if(UtilText.getDefault(getName()).length()> 50) {
			validationMessages.add(getName()).matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ]"*$)) {
			
			} else if(!UtilText.getDefault(getName()).matches("^[a-zA-ZÑ]")); {
				validationMessages.add("caracteres invalidos");
			}
		}
	}

}
