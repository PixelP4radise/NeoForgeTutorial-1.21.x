# Modding in Neoforge

## Items

1. First u need a register, for this u use a defferedRegister for items
2. Then u make a function to register and call that function on the Mods contructor
3. Then u create the item that should almost always be a public static final and use the register to add it to the mod
4. Then in the resources, u should create a directory for lang, models, textures
5. On the lang directory ur going to place the Item's name for each trasnlation
6. On both the models and textures directory ur going to create an item directory
7. On models/item ur going to put the json that specifies how your item should be rendered
8. On the textures/item ur going to put the textures for the item
9. Then u need to make the item available on creative trough a menu with the accept method