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

## Blocks

1. First u need a register
2. Then u make a function to register and call that function on the Mods constructor
3. The thing with blocks is that u also need to register an item that is associated with that block
    1. So first we make the helper functions to register the item
    2. and the helper function to register the block at the same time registering the item
4. Then we create the block
5. on the lang directory we place the translation for the block
6. and then we will need a new directory called blockstates that needs to specify how the block is presented
7. in the models we specify both the block in the block directory and the item (the item points to the block saying it's
   its parent)
8. we place the texture on the block directory
9. and we make the block available trough the creative menu

## Creative Mode Tabs

1. First u need the register
2. Then the function to register and call that on the mod constructor
3. Then u create the creative mod tab with a supplier and use the builder to fill it with items and give it a title and
   such
    1. Be aware that next tabs should have the function withTabsBefore to prevent tabs from changing places on different
       runs
4. To finalize u give it a translation in lang