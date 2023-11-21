//Clase profesor que hereda de la clase Persona
public class Profesor extends Persona{
    
    /*Atributos*/
    private String materia;
   
    /*Constructores*/
    public Profesor(){

        //Llamamos  al constructor padre
       super(); 
       
       //llamamos  al metodo padre
       super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,50)); 
       
       materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
    }

    /*Metodos*/
    
    /**
     * Devuelve la materia del profesor
     * @return 
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Modifica la materia del profesor
     * @param materia 
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Calcula la disponibilidad del profesor(20%)
     */
    @Override
    public void disponibilidad() {
       
        int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
        
        if(prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
        
    }
   
}