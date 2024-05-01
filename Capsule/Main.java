package Capsule;

class MyClass {
    public static void main(String[] args) {
        CapsulationPractice capsulationPractice = new CapsulationPractice();
        capsulationPractice.setPrivateData(200);
        System.out.println("CapsulationData:" + capsulationPractice.getPrivateData());
    }
}

class CapsulationPractice {
    private int privateData = 100;

    /**
     * 値をセットする
     * @param privateData
     */
    public void setPrivateData(int privateData) {
        this.privateData = privateData;
    }

    /**
     * 値を返却する
     * @return
     */
    public int getPrivateData() {
        return privateData;
    }
}

