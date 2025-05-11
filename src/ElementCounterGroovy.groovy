class ElementCounterGroovy {
    static Map<Integer, Integer> countElements(List<Integer> list) {
        def result = [:]  // ������ ����� ��� �������� ����������
        list.each { element ->
            result[element] = result.get(element, 0) + 1  // ����������� ������� ��� ������� ��������
        }
        return result
    }

    static void main(String[] args) {
        def list = [1, 3, 4, 5, 1, 5, 4]
        def count = countElements(list)
        println count  // ������� ���������
    }
}
