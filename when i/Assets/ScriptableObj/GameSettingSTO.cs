using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "GameSettingSTO", menuName = "STO/Map Settings")] // ScriptableObject���ȒP�ɍ쐬���邽�߂̑���
public class GameSettingSTO : ScriptableObject // ScriptableObject���p�������N���X
{
    int selectNight = 1;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public int GetSelectNight()
    {
        return selectNight;
    }
}
