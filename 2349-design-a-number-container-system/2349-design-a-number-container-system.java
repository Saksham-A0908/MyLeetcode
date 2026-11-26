class NumberContainers {

    int[] indices = new int[100001];
    int[] numbers = new int[100001];
    int size = 0;

    public NumberContainers() {
    }

    public void change(int index, int number) {

        for (int i = 0; i < size; i++) {
            if (indices[i] == index) {
                numbers[i] = number;
                return;
            }
        }

        indices[size] = index;
        numbers[size] = number;
        size++;
    }

    public int find(int number) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                min = Math.min(min, indices[i]);
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}