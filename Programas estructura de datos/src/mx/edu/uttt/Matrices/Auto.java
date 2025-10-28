package mx.edu.uttt.Matrices;

public class Auto {

  private String model;
  private int milesDriven;
  private double Gallons;

    public Auto() {
        this.model = "Unknow";
    }

    public Auto(String model, int milesDriven, double gallons) {
        this.model = model;
        this.setMilesDriven(milesDriven);
        this.setGallons(gallons);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDriven() {
        if (milesDriven >=0) {
            return milesDriven;
        }else {
            System.out.println("miles driven cannot be negative");
            System.out.println("value not changed");
        }
        return 0;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getGallons() {
        return Gallons;
    }

    public void setGallons(double gallons) {
       if (gallons >= 0) {
           Gallons = gallons;
       }else {
           System.out.println("gallons cannot be negative");
           System.out.println("value not changed");
       }
    }
public double calculatedmilesGallons() {
        if(getGallons()!= 0.0){
            return Gallons/getGallons();
        }else {
            return 0.0;
        }
}
    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDriven=" + milesDriven +
                ", Gallons=" + Gallons +
                '}';
    }
}
