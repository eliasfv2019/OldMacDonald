class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm() {
    aBunchOfAnimals[0] = new Cow();
    aBunchOfAnimals[1] = new Chick();
    aBunchOfAnimals[2] = new Pig();
  }
  public void animalSounds() {
    for (int i = 0; i < aBunchOfAnimals.length; i++) {
      System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
    }
    System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
  }


  //your code here
}
