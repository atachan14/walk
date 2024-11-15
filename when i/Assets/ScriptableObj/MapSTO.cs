using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Tilemaps;

[CreateAssetMenu(fileName = "MapSTO", menuName = "STO/Map Settings")] // ScriptableObject‚ğŠÈ’P‚Éì¬‚·‚é‚½‚ß‚Ì‘®«
public class MapSTO : ScriptableObject // ScriptableObject‚ğŒp³‚µ‚½ƒNƒ‰ƒX
{

    public int mapSizeX;
    public int mapSizeY;
    public Land[,] map;

    void Start()
    {

    }

    public void SetMapSizeX(int x)
    {
        this.mapSizeX = x;
    }

    public void SetMapSizeY(int y)
    {
        this.mapSizeY = y;
    }

    public void GenerateMap()
    {
        map = new Land[mapSizeX,mapSizeY];
    }

}