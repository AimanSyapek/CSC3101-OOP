// Author name: MUHAMMAD AIMAN SYAFIQ BIN MD.ARIFIN
// Matric No: 210564
// Lecturer: DR MOHD IZUAN HAFEZ BIN NINGGAL
// Subject and group: CSC3101 G4
// Lab question: Lab 1 Question 2

public class TV {
    int channel=2;
    int volumeLevel=1;
    boolean on = false;

    public TV(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        channel = newChannel;
    }

    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        ++channel;
    }

    public void channelDown(){
        --channel;
    }

    public void volumeUp(){
        ++volumeLevel;
    }

    public void volumeDown(){
        --volumeLevel;
    }

}
