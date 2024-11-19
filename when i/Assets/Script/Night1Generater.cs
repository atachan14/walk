using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using static UnityEngine.Rendering.RayTracingAccelerationStructure;

public class Night1Generater : MonoBehaviour
{
    [SerializeField] private MapSTO mapSTO;
    [SerializeField] private GameSettingSTO gameSettingSTO;

    // Start is called before the first frame update
    void Start()
    {
        mapSTO = new MapSTO();
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void Generate()
    {
        mapSTO.SetMapSizeX(11);
        mapSTO.SetMapSizeY(11);

    }
}
