
public class Package {
    public String Name;
    private Integer PackageId;
    public Integer Fee;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getPackageId() {
        return PackageId;
    }

    public void setPackageId(Integer PackageId) {
        this.PackageId = PackageId;
    }

    public Integer getFee() {
        return Fee;
    }

    public void setFee(Integer Fee) {
        this.Fee = Fee;
    }
}
