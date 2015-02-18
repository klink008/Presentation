import presentation.Form

class BootStrap {

    def init = { servletContext ->

        def firstUser = new Form(userName: "Klink")
        def secondUser = new Form(userName: "Superman")

        firstUser.save()
        secondUser.save()
    }
    def destroy = {
    }
}
