

package logikaioop_csoport.model;




public class Lada {
    private String allitas = "";
    private String anyag = "";
    private boolean kincs;
    

    public Lada(String anyag, String allitas) {
        this.anyag = anyag;
        this.allitas = allitas;
        kincs_e();     
    }
    


  

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public boolean getKincs() {
        return kincs;
    }
    
    public void kincs_e(){
        if (allitas == "Az arany hazudik."){
            setKincs(true);
        } else {
            setKincs(false);       
        }
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }

    
    
}
