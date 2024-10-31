class bicycle extends Vehicle {
    private String tipeSepeda;

    public bicycle(int jumlahRoda, double harga, String tipeSepeda) {
        super(jumlahRoda , harga );
        this.tipeSepeda = tipeSepeda;
    }

    
    public String getTipeSepeda() {
        return tipeSepeda;
    }

    public void setTipeSepeda(String tipeSepeda) {
        this.tipeSepeda = tipeSepeda;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Tipe Sepeda : " + tipeSepeda);
    }
}