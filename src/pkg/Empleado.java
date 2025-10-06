package pkg;

public class Empleado {
	public enum TipoEmpleado{Vendedor, Encargado};
	static float salarioBase=0;
	static float primas=0;
	static float extras=0;
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtras) {
		//determinar salario base
		if(tipo==TipoEmpleado.Encargado) {
			salarioBase=2500;
		}else {
			salarioBase=2000;
		}
		
		//determinar primas
		if(ventasMes>=1500) {
			primas=200;
		}else if(ventasMes>=1000){
			primas=100;
		}
		
		//determinar extras
		extras=horasExtras*30;
		return salarioBase+primas+extras;
		
		//tipoEmpleado 3, ventasMes 4, horasExtras 3
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		if(nominaBruta<2100) {
			retencion = 0;
		}else if(nominaBruta>=2100 && nominaBruta<2500) {
			retencion = (float) 0.15;
		}else if(nominaBruta>=2500) {
			retencion = (float) 0.18;
		}
		return nominaBruta*(1-retencion);
	}
	
}
