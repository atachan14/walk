using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "GameSettingSTO", menuName = "STO/Map Settings")] // ScriptableObjectを簡単に作成するための属性
public class GameSettingSTO : ScriptableObject // ScriptableObjectを継承したクラス
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
