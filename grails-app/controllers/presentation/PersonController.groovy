package presentation

class PersonController {
    def form() {
    }
    def save() {
        def person = new Person(params)
        person.save()
        render "Success!"
    }
}