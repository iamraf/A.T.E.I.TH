package lab4;

public class Presets
{
    private int SBass;
    private int SMidrange;
    private int STremble;
    private int SBalance;
    private int SVolume;

    public Presets(int SBass, int SMidrange, int STremble, int SBalance, int SVolume) {
        this.SBass = SBass;
        this.SMidrange = SMidrange;
        this.STremble = STremble;
        this.SBalance = SBalance;
        this.SVolume = SVolume;
    }

    public int getSBalance() {
        return SBalance;
    }

    public void setSBalance(int SBalance) {
        this.SBalance = SBalance;
    }

    public int getSBass() {
        return SBass;
    }

    public void setSBass(int SBass) {
        this.SBass = SBass;
    }

    public int getSMidrange() {
        return SMidrange;
    }

    public void setSMidrange(int SMidrange) {
        this.SMidrange = SMidrange;
    }

    public int getSTremble() {
        return STremble;
    }

    public void setSTremble(int STremble) {
        this.STremble = STremble;
    }

    public int getSVolume() {
        return SVolume;
    }

    public void setSVolume(int SVolume) {
        this.SVolume = SVolume;
    }
    
    
}
