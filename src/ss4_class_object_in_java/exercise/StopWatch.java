package ss4_class_object_in_java.exercise;


public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = System.currentTimeMillis();

    }


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        long startTime = watch.start();
        System.out.println("Start time : " + startTime);


        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                    if (min != i) {
                        int temp = array[min];
                        array[min] = array[i];
                        array[i] = temp;
                    }

                }
            }
        }

        long endTime = watch.stop();
        System.out.println("End time : " + endTime);
        long elapsedTime = watch.getElapsedTime();
        System.out.println("Time elapse : " + elapsedTime);
    }
}