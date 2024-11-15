using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NightSelecter: MonoBehaviour
{
    GameSettingSTO gameSettingSTO;

    // Start is called before the first frame update
    void Start()
    {
        NightSelect();
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void NightSelect()
    {
        switch (gameSettingSTO.GetSelectNight())
        {
            case 1:
                Night1Generater.Generate();
                break;
        }
    }

}
