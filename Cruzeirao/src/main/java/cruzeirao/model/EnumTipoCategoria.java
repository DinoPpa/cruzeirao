package cruzeirao.model;

public enum EnumTipoCategoria {
	Masculino("Masculino"),
	Feminino("Femino"),
	Misto("Misto");
	
	private String label;
	
	private EnumTipoCategoria(String l) {
		label = l;
	}
	
	private String getLabel(){
		return label;
	}
}
