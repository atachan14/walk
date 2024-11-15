using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Tilemaps;

[CreateAssetMenu(fileName = "MapSTO", menuName = "STO/Map Settings")] // ScriptableObject���ȒP�ɍ쐬���邽�߂̑���
public class MapSTO : ScriptableObject // ScriptableObject���p�������N���X
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