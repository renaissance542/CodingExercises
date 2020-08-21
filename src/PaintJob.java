public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }
        int bucketsNeeded = (int) ((width * height / areaPerBucket) - extraBuckets);
        if (bucketsNeeded < ( (width * height / areaPerBucket) - extraBuckets)){
            bucketsNeeded += 1;
        }
        return bucketsNeeded;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        int bucketsNeeded = (int) ((width * height / areaPerBucket));
        if (bucketsNeeded < ( (width * height / areaPerBucket))){
            bucketsNeeded += 1;
        }
        return bucketsNeeded;
    }

    public static int getBucketCount (double area, double areaPerBucket){

        if ((area <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((area / areaPerBucket));
//        int bucketsNeeded = (int) ((area / areaPerBucket));
//        if (bucketsNeeded < ( (area / areaPerBucket))){
//            bucketsNeeded += 1;
//        }
        return bucketsNeeded;
    }

}
