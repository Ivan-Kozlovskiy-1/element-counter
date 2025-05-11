class ElementCounterGroovy {
    static Map<Integer, Integer> countElements(List<Integer> list) {
        def result = [:]  // пустая карта для хранения результата
        list.each { element ->
            result[element] = result.get(element, 0) + 1  // увеличиваем счётчик для каждого элемента
        }
        return result
    }

    static void main(String[] args) {
        def list = [1, 3, 4, 5, 1, 5, 4]
        def count = countElements(list)
        println count  // выводим результат
    }
}
