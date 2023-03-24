package homeWork6;

import java.util.Objects;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class Laptop {
    private String manufacturer;
    private String model;
    private Integer rAM;
    private String type;
    private String processorLine;
    private Integer numberOfProcessorCores;
    private Double screenDiagonal;
    private Integer volumeSSD;
    private String videoCard;
    private boolean touchScreen;

    public Laptop(String manufacturer, String model,
                  Integer rAM, String type, String processorLine,
                  Integer numberOfProcessorCores, Double screenDiagonal,
                  Integer volumeSSD, String videoCard, boolean touchScreen) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.rAM = rAM;
        this.type = type;
        this.processorLine = processorLine;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.screenDiagonal = screenDiagonal;
        this.volumeSSD = volumeSSD;
        this.videoCard = videoCard;
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + manufacturer + '\'' +
                ", screenDiagonal=" + screenDiagonal +
                ", volumeSSD=" + volumeSSD +
                ", touchScreen=" + touchScreen +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Laptop{" +
//                "manufacturer='" + manufacturer + '\'' +
//                ", model='" + model + '\'' +
//                ", rAM=" + rAM +
//                ", type='" + type + '\'' +
//                ", processorLine='" + processorLine + '\'' +
//                ", numberOfProcessorCores=" + numberOfProcessorCores +
//                ", screenDiagonal=" + screenDiagonal +
//                ", volumeSSD=" + volumeSSD +
//                ", videoCard='" + videoCard + '\'' +
//                ", touchScreen=" + touchScreen +
//                '}';
//    }
    public void printLaptop(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return touchScreen == laptop.touchScreen && Objects.equals(manufacturer, laptop.manufacturer)
                && Objects.equals(model, laptop.model) && Objects.equals(rAM, laptop.rAM)
                && Objects.equals(type, laptop.type) && Objects.equals(processorLine, laptop.processorLine)
                && Objects.equals(numberOfProcessorCores, laptop.numberOfProcessorCores)
                && Objects.equals(screenDiagonal, laptop.screenDiagonal)
                && Objects.equals(volumeSSD, laptop.volumeSSD) && Objects.equals(videoCard, laptop.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, rAM, type, processorLine, numberOfProcessorCores, screenDiagonal, volumeSSD, videoCard, touchScreen);
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public Double getScreenDiagonal() {
        return screenDiagonal;
    }
    public Integer getVolumeSSD() {
        return volumeSSD;
    }
    public boolean isTouchScreen() {
        return touchScreen;
    }

//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Integer getrAM() {
//        return rAM;
//    }
//
//    public void setrAM(Integer rAM) {
//        this.rAM = rAM;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getProcessorLine() {
//        return processorLine;
//    }
//
//    public void setProcessorLine(String processorLine) {
//        this.processorLine = processorLine;
//    }
//
//    public Integer getNumberOfProcessorCores() {
//        return numberOfProcessorCores;
//    }
//
//    public void setNumberOfProcessorCores(Integer numberOfProcessorCores) {
//        this.numberOfProcessorCores = numberOfProcessorCores;
//    }


//    public void setScreenDiagonal(Double screenDiagonal) {
//        this.screenDiagonal = screenDiagonal;
//    }



//    public void setVolumeSSD(Integer volumeSSD) {
//        this.volumeSSD = volumeSSD;
//    }
//
//    public String getVideoCard() {
//        return videoCard;
//    }
//
//    public void setVideoCard(String videoCard) {
//        this.videoCard = videoCard;
//    }



//    public void setTouchScreen(boolean touchScreen) {
//        this.touchScreen = touchScreen;
//    }
}
