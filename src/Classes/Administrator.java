package Classes;

//import .*;


public class Administrator {
    
    public String Name;
    private String NIC;
    private String AID;

    Bands b1 = new Bands();
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }
    
    public void addbanddetails (String n,Float f){
        b1.Name = n;
        b1.fee = f;
        
        try{
        String q ="INSERT INTO music_bands (mu_id,name,no_of_members,payment) VALUES ('"+ b1.bid +"','"+ b1.Name +"' , '"+ number +"' , '" + b1.fee +"')";
        pst =con.prepareStatement(q);
        
        pst.execute();
        }catch(Exception e){
        
    }
    
     public void deletedetails (){
    
    }
      public void removeetails (){
    
    }
       public void getreport (){
    
    }
 }
