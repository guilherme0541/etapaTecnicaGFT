package aumentoSalario;

public class Colaborador {
    
    private float salario;

    private float percentualAumento;

    public String mostrarAumento(){
        return "Salario atual :"+ String.format("%.2f", getSalario())+
                    "\nPercentual de Aumento : "+ String.format("%.0f", 100f*getPercentualAumento()) + "%" +
                    "\n Valor Aumento : "+ String.format("%.2f", getAumento()) +
                    "\n Novo Salario : " + String.format("%.2f", getNovoSalario());
    }

    private float getNovoSalario() {
        return salario*(1+percentualAumento);
    }

    private float getAumento() {
        return salario*percentualAumento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPercentualAumento() {
        return percentualAumento;
    }

    public void setPercentualAumento(float percentualAumento) {
        this.percentualAumento = percentualAumento;
    }

    public Colaborador(float salario) {
        
        float percentual = 0.25f;
        if (salario>5000f) {
            percentual = 0.1f;
        } else {
            if (salario>3000f) {
                percentual = 0.15f;
            } else {
                if (salario>1600f) {
                    percentual = 0.2f;
                } 
            }
        }
        this.setSalario(salario);
        this.setPercentualAumento(percentual);
    }

    
    
}
