using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "GameSettingSTO", menuName = "STO/Map Settings")] // ScriptableObject‚ğŠÈ’P‚Éì¬‚·‚é‚½‚ß‚Ì‘®«
public class GameSettingSTO : ScriptableObject // ScriptableObject‚ğŒp³‚µ‚½ƒNƒ‰ƒX
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
