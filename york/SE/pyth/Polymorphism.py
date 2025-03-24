class Bird:
    def fly(self):
        return "Flies in the sky."

class Airplane:
    def fly(self):
        return "Flies using engines."

def let_it_fly(flying_thing):
    print(flying_thing.fly())

let_it_fly(Bird())      # ✅ Output: Flies in the sky.
let_it_fly(Airplane())  # ✅ Output: Flies using engines.
