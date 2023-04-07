package ss4_lop_va_doi_tuong.stop_watch;

public class StopWatch {
    public double startTime;
    public double endTime;

    public StopWatch() {

    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    } public double getElapsedTime() {
        return endTime-startTime;
    }
}
